public class Encryptor
{
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Constructor*/
    public Encryptor(int r, int c)
    {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock()
    {
        return letterBlock;
    }

    /** Places a string into letterBlock in row-major order.
     *
     *   @param str  the string to be processed
     *
     *   Postcondition:
     *     if str.length() < numRows * numCols, "A" in each unfilled cell
     *     if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str)
    {
        int row = 0;
        int col = 0;
        int count = 0;
        while ((row < numRows && col < numCols) && count < str.length())
        {
            for (int k = 0; k < str.length() && (row < numRows && col < numCols); k++)
            {
                String character = str.substring(k, k + 1);
                letterBlock[row][col] = character;
                count++;
                if (col == numCols - 1)
                {
                    col = 0;
                    row++;
                }
                else
                {
                    col++;
                }
            }
        }

        int lastRow = numRows - 1;
        int lastCol = numCols - 1;
        String lastLetter = str.substring(str.length() - 1);
        if (str.length() <= numRows * numCols)
        {
            while (letterBlock[lastRow][lastCol] == null || !letterBlock[lastRow][lastCol].equals(lastLetter))
            {
                letterBlock[lastRow][lastCol] = "A";
                if (lastCol == 0)
                {
                    lastCol = numCols - 1;
                    lastRow--;
                }
                else
                {
                    lastCol--;
                }
                if (lastRow == 0)
                {
                    lastRow = numRows - 1;
                }
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *
     *   Precondition: letterBlock has been filled
     *
     *   @return the encrypted string from letterBlock
     */
    public String encryptBlock()
    {
        String encrypted = "";
        for (int c = 0; c < numCols; c++)
        {
            for (int r = 0; r < numRows; r++)
            {
                encrypted += letterBlock[r][c];
            }
        }
        return encrypted;
    }

    /** Encrypts a message.
     *
     *  @param message the string to be encrypted
     *
     *  @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        String encrypted = "";
        int size = numRows * numCols;
        while (message.length() > 0)
        {
            if (size > message.length())
            {
                size = message.length();
            }
            fillBlock(message);
            encrypted += encryptBlock();
            message = message.substring(size);
        }
        return encrypted;
    }

    /**  Decrypts an encrypted message. All filler 'A's that may have been
     *   added during encryption will be removed, so this assumes that the
     *   original message (BEFORE it was encrypted) did NOT end in a capital A!
     *
     *   NOTE! When you are decrypting an encrypted message,
     *         be sure that you have initialized your Encryptor object
     *         with the same row/column used to encrypted the message! (i.e.
     *         the “encryption key” that is necessary for successful decryption)
     *         This is outlined in the precondition below.
     *
     *   Precondition: the Encryptor object being used for decryption has been
     *                 initialized with the same number of rows and columns
     *                 as was used for the Encryptor object used for encryption.
     *
     *   @param encryptedMessage  the encrypted message to decrypt
     *
     *   @return  the decrypted, original message (which had been encrypted)
     *
     *   TIP: You are encouraged to create other helper methods as you see fit
     *        (e.g. a method to decrypt each section of the decrypted message,
     *         similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage)
    {
        String decrypted = "";
        int size = numRows * numCols;

        while (encryptedMessage.length() > 0)
        {
            String chunkToDecrypt = encryptedMessage.substring(0, size);
            decrypted += decryptBlock(chunkToDecrypt);
            encryptedMessage = encryptedMessage.substring(size);
        }

        String lastChar = decrypted.substring(decrypted.length() - 1);

        while (lastChar.equals("A"))
        {
            decrypted = decrypted.substring(0, decrypted.length() - 1);
            lastChar = decrypted.substring(decrypted.length() - 1);
        }
        return decrypted;
    }

    public String decryptBlock(String blockStr)
    {
        String[][] temp2D = new String[numRows][numCols];
        int pos = 0;
        for (int col = 0; col < temp2D[0].length; col++)
        {
            for (int row = 0; row < temp2D.length; row++)
            {
                temp2D[row][col] = blockStr.substring(pos, pos + 1);
                pos++;
            }
        }

        String decryptedBlock = "";
        for (int row = 0; row < temp2D.length; row++)
        {
            for (int col = 0; col < temp2D[0].length; col++)
            {
                String element = temp2D[row][col];
                decryptedBlock += element;
            }
        }
        return decryptedBlock;
    }
}
