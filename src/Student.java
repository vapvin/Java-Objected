public class Student {
    String name;
    int grade;
    int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void showInfo(){
        System.out.println(name + "님의 남은 돈은" + money + "원 입니다.");
    }
}
