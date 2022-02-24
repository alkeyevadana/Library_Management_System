public class Module1 {
    private String name, surname,uni_id,uid;
    int trim;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUni_id() {
        return uni_id;
    }

    public void setUni_id(String uni_id) {
        this.uni_id = uni_id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getTrim() {
        return trim;
    }

    public void setTrim(int trim) {
        this.trim = trim;
    }

    public void getdata(String name, String surname, String uni_id, String uid, int trim){
        this.name=name;
        this.surname=surname;
        this.uni_id=uni_id;
        this.uid=uid;
        this.trim=trim;

    }

    public void setdata(){
        System.out.println("Student's name: "+name);
        System.out.println("Student's surname: "+surname);
        System.out.println("University id: "+uni_id);
        System.out.println("User id: "+uid);
        System.out.println("Trimester: "+trim);

    }
}
