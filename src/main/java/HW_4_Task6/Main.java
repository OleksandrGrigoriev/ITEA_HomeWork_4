package HW_4_Task6;

/**
 * Створіть проект з класом Main.java.
 *
 * Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
 * У тілі класу створіть методи void study(), void read(), void write(), void relax().
 * Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
 * перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom
 * приймає аргументи типу Pupil, клас має складатися з 4 учнів. Передбачте можливість,
 * що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні
 * екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */
public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Pupil excellentPupil = new ExcellentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();

        ClassRoom classRoom = new ClassRoom(pupil, excellentPupil, goodPupil, badPupil);

        classRoom.pupil1.study();
        classRoom.pupil1.read();
        classRoom.pupil1.write();
        classRoom.pupil1.relax();

        System.out.println();

        classRoom.pupil2.study();
        classRoom.pupil2.read();
        classRoom.pupil2.write();
        classRoom.pupil2.relax();

        System.out.println();

        classRoom.pupil3.study();
        classRoom.pupil3.read();
        classRoom.pupil3.write();
        classRoom.pupil3.relax();

        System.out.println();

        classRoom.pupil4.study();
        classRoom.pupil4.read();
        classRoom.pupil4.write();
        classRoom.pupil4.relax();
    }
}