package chapter7.test;

import chapter7.school.School;
import chapter7.school.Subject;
import chapter7.school.Score;
import chapter7.school.Student;
import chapter7.school.report.GenerateGradeReport;
import chapter7.utils.Define;
public class TestMain {

    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {

        TestMain test = new TestMain();

        test.creatSubject();
        test.createStudent();

        String report = test.gradeReport.getReport(); //성적 결과 생성
        System.out.println(report); // 출력

    }

    //테스트 과목 생성
    public void creatSubject(){

        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    //테스트 학생 생성
    public void createStudent(){

        Student student1 = new Student(211213, "강감찬", korean  );
        Student student2 = new Student(212330, "김유신", math  );
        Student student3 = new Student(201518, "신사임당", korean  );
        Student student4 = new Student(202360, "이순신", korean  );
        Student student5 = new Student(201290, "홍길동", math );

        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
    }

    //과목별 성적 입력
    public void addScoreForStudent(Student student, Subject subject, int point){

        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);

    }
}

