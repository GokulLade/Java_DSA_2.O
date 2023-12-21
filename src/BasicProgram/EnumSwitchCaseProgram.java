package BasicProgram;

public class EnumSwitchCaseProgram {
    public static void main(String[] args) {
        enum Result{
            PASS,FAIL,NR;
        }
        Result res=Result.PASS;
        switch(res)
        {
                case PASS:
                    System.out.println("Passed");
                    break;
                case FAIL:
                    System.out.println("Failed");
                    break;
                case NR:
                    System.out.println("Result not declared");
                    break;
        }
    }
}
