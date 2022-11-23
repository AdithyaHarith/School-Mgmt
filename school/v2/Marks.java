package school.v2;

public class Marks {
    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int socialScience;

    public Marks(int tamil, int english, int maths, int science, int socialScience) {
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.socialScience = socialScience;
    }
    public void displayMarks() {
        System.out.println("Mark details: ");
        System.out.println("Tamil: " + tamil);
        System.out.println("English : "+english);
        System.out.println("Maths: " +maths);
        System.out.println("Science: "+science);
        System.out.println("Social Science: "+socialScience);
        int totalMark = tamil+english+maths+science+socialScience;
        System.out.println("totalMark: "+totalMark);
    }
}
