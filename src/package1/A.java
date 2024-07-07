package package1;

class A {
    
    public static void main(String[] args) {
        Task_01:
        for (int i = 1; i <= 10; i++){
            Task_02:
            for (int j = 1; j <= 3; j++){
                if(i == 5){
                    break Task_01;
                }
                System.out.println(i+""+j);
            }
        }
    }
    
}
