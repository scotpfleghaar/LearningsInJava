class Student {
    int id;
    String name;
    String gender = "male";
    char[] grades;

    Student(String name) {
        this.name = name;
    }

    Student(int id, String name) {
        this(name);
        this.id = id;
    }

    Student(int id, String name, String gender) {
        this(id, name);
        this.gender = gender;
    }

    Student(int id, String name, String gender, char[] grades) {
     this(id, name, gender)
        this.grades = grades;
    }

    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
}