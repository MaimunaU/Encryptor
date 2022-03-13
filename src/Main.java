public class Main {
    public static void main(String[] args)
    {
        Encryptor encryptor = new Encryptor(2, 3);
        String decryptedMsg = encryptor.decryptMessage("Mte eati dmnitgAhA");
        System.out.println(decryptedMsg);

        Encryptor encryptor2 = new Encryptor(3, 2);
        decryptedMsg = encryptor2.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A");
        System.out.println(decryptedMsg);

        Encryptor encryptor3 = new Encryptor(3, 4);
        //String encryptedMsg = encryptor3.encryptMessage("This lab was the most frustrating assignment yet.");
        //System.out.println(encryptedMsg);
        String encryptedMsg = encryptor3.encryptMessage("This lab was the most frustrating assignment yet");
        System.out.println(encryptedMsg);

        //Encryptor encryptor4 = new Encryptor(6, 5);
        //encryptedMsg = encryptor4.encryptMessage("This one time I was trying to do a handstand and fell backwards " +
        //        "and landed on my shoe. It hurt! I won't try that again.");
        //System.out.println(encryptedMsg);

        //Encryptor encryptor5 = new Encryptor(5, 5);
        //decryptedMsg = encryptor5.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  " +
        //        "d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA");
        //System.out.println(decryptedMsg);

        //decryptedMsg = encryptor4.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    " +
        //        "sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA");
        //System.out.println(decryptedMsg);

        //Encryptor encryptor6 = new Encryptor(9, 8);
        //decryptedMsg = encryptor6.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA");
        //System.out.println(decryptedMsg);

        decryptedMsg = encryptor3.decryptMessage("Dtco rndy’eptie sst shmagAAeAAAAAAAA");
        System.out.println(decryptedMsg);

        Encryptor encryptor7 = new Encryptor(3, 3);
        decryptedMsg = encryptor7.decryptMessage("Trahere e  t2lt6eeritsnh  e gsElhni lggauena, ve5ol ws,n2 d1a  csaoonnntsAA.AAAAA");
        System.out.println(decryptedMsg);
    }
}
