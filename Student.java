
// them nut con vao cha thì them exta
public class Student {
    // public String name;
    // public String id;
    // public String grade;
    // public int age;
    // public float avgMark;
    // public float fee;
    // public String email;
    // public String phoneNumber;

    private String name;
    private String id;
    private String grade;
    private int age;
    private float avgMark;
    private float fee;
    private String email;
    private String phoneNumber;

    // muon lay thong tin ra: get;
    // muon thiet lap thong tin: set;

    // Phuong thuc khoi tao:
    public Student(){

    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Student(String id, String grade, float fee, String email, String phoneNumber) {
        this.id = id;   // this(id);
        this.grade = grade;
        this.fee = fee;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Student(String name, String id, String grade, int age, float avgMark, float fee, String email,
            String phoneNumber) {
        this.name = name;    // this(id, name, grade, fee, email, phoneNumber);
        this.id = id;
        this.grade = grade;
        this.age = age;
        this.avgMark = avgMark;
        this.fee = fee;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
    
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void study(String subject){

    }

    public void payfee(float amount){

    }

    public void doHomework(String subject){

    }

    public void doTest(String subject){

    }

    public static void main(String[] argv){
        Student st = new Student();
        st.setName("Linh");
        st.setId("21012508");

        System.out.println("Name of student: " + st.getName());
        System.out.println("ID of student: " + st.getId());
    }
}



