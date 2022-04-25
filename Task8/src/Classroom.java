public class Classroom {
    private int classID;
    private String className;

    public Classroom() {
        classID = 1;
        className = "T2109A";
    }
    public Classroom(int id , String name) {
        this.classID = id;
        this.className = name;
    }
    public int getClassID() {
        return classID;
    }
    public void setClassID(int classID) {
        this.classID = classID;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classID=" + classID +
                ", className='" + className + '\'' +
                '}';
    }
}
