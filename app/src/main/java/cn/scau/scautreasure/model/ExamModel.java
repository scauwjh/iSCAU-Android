package cn.scau.scautreasure.model;

import java.util.List;

/**
 * User:  Special Leung
 * Date:  13-8-17
 * Time:  下午2:58
 * Mail:  specialcyci@gmail.com
 */
//        "课程名称" => "name",
//        "姓名" => "name_student",
//        "考试时间" => "time",
//        "考试地点" => "place",
//        "考试形式" => "form",
//        "座位号" => "seat_number",
//        "校区" => "campus"
public class ExamModel {

    private String name;
    private String name_student;
    private String time;
    private String place;
    private String form;
    private String seat_number;
    private String campus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "ExamModel{" +
                "name='" + name + '\'' +
                ", name_student='" + name_student + '\'' +
                ", time='" + time + '\'' +
                ", place='" + place + '\'' +
                ", form='" + form + '\'' +
                ", seat_number='" + seat_number + '\'' +
                ", campus='" + campus + '\'' +
                '}';
    }

    public class ExamList{

        private List<ExamModel> exam;

        public List<ExamModel> getExam() {
            return exam;
        }

        public void setExam(List<ExamModel> exam) {
            this.exam = exam;
        }
    }
}
