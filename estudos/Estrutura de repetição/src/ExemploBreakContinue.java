
// BREAK E CONTINUE EM FOR


public class ExemploBreakContinue {
    public static void main(String[] args) {

        // BREAK
        for (int i = 1; i <= 5; i++) {
            if(i ==3)
                break;
            
            System.out.println(i); // 1, 2
        }

        //CONTINUE
        for (int i = 1; i <= 5; i++) {
            if(i ==3)
                continue;
            
            System.out.println(i);// 1, 2, 4, 5
        }
    }    
}
