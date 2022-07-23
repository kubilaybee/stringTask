public class Main {
    public static void main(String[] args) {

        StringFuncs test = new StringFuncs("temp training");

        useAllStrFunctions(test);


    }
    public static void useAllStrFunctions(StringFuncs test){
        test.showTheOriginal();
        test.showCharAt(2);
        test.showEquals("test");
        test.showEqualsIgnoreCase("TEMP training");
        test.showCompareTo("temp training");
        test.showCompareToIgnoreCase("temp");
        test.showStartWith("es");
        test.showStartWith("training",5);
        test.showEndWith("g");
        test.showHashCode();
        test.showIndexOf('t');
        test.showIndexOf('t',1);
        test.showLastIndexOf('t');
        test.showLastIndexOf('t',3);
        test.showSubstring(0,4);
        test.showSubstring(2);
        test.showConcat(" concat");
        test.showReplace('t','k');
        test.showContains("temp");
        test.showUpperCase();
        test.showLowerCase();
        test.showIntern();
        test.showJoin("first","sec");
        test.showIsEmpty();
        test.showReplaceFirst("Data");
        test.showReplaceAll("all");
        test.showSplit(" ");
        test.showFormat();
        test.showTrim();
    }
}
