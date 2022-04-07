public class Overloading {

    static class Tast{
        void human(){
            System.out.println("파라미터가 없음");
        }
        void human(int a){
            System.out.println("파라미터의 타입이 인트 갯수는 한개, 이름은 같다");
        }
        void human(int a,int b){
            System.out.println("파라미터 타입들 이 인트, 갯수는 두개, 이름은 같음");
        }
        void human(String a){
            System.out.println("이번엔 파라미터의 타입이 스트링으로 다름");
        }
    }

    public static void main(String[] args) {
        Tast a = new Tast();
        a.human();
        a.human(3);
    }
}
