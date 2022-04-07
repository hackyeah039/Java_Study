//부모 클래스
class SuperClass{
    public void info(){
        System.out.println("수퍼 클래스의 info 메소드 입니다.");
    }
    public void info2(){
        System.out.println("수퍼 클래스의 info 메소드 2 입니다");
    }
}
//자식 클래스
class SubClass extends SuperClass{
    public void info(){
        System.out.println("서브 클래스, 수퍼 클래스를 상속받았습니다.");
    }
    public void info2(int a){
        System.out.println(a+ " 서브 클래스, info2 상속 & 오버로딩");
    }
    public void info2(int a,int b){
        System.out.println(a+b + " 서브 클래스, info2 상속 & 오버로딩 파라미터 2개");
    }
}
public class Overriding {
    public static void main(String[] args) {
        SuperClass a =new SubClass();
        SuperClass b =new SuperClass();
        SubClass c = new SubClass();
        a.info();
        a.info2();
        b.info();
        b.info2();
        c.info();
        c.info2(1);
        c.info2(1,3);
    }
}
