
package quiz3;


import java.util.Scanner;
interface AdmissionProcess{
        public double calculateFee();
    }
class University implements AdmissionProcess{
    private String name;
    private double AdmissionFee;
    private String programType;

    public University(String name, double AdmissionFee, String programType) {
        this.name = name;
        this.AdmissionFee = AdmissionFee;
        this.programType = programType;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdmissionFee() {
        return AdmissionFee;
    }

    public void setAdmissionFee(double AdmissionFee) {
        this.AdmissionFee = AdmissionFee;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    @Override
    public String toString() {
        return "University{" + "name=" + name + ", AdmissionFee=" + AdmissionFee + ", programType=" + programType + '}';
    }

    @Override
    public double calculateFee() {
        if(programType.equals("Graduate")){
            return AdmissionFee*2.5;
        }
        else{
            return AdmissionFee;
        }
       
    }
    
    
}
class College implements AdmissionProcess{
    private String name;
    private double admissionFee;
    private int numberOfsiblings;

    public College(String name, double admissionFee, int numberOfsiblings) {
        this.name = name;
        this.admissionFee = admissionFee;
        this.numberOfsiblings = numberOfsiblings;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(double admissionFee) {
        this.admissionFee = admissionFee;
    }

    public int getNumberOfsiblings() {
        return numberOfsiblings;
    }

    public void setNumberOfsiblings(int numberOfsiblings) {
        this.numberOfsiblings = numberOfsiblings;
    }

    @Override
    public String toString() {
        return "College{" + "name=" + name + ", admissionFee=" + admissionFee + ", numberOfsiblings=" + numberOfsiblings + '}';
    }

    @Override
    public double calculateFee() {
        if(numberOfsiblings>1){
            return admissionFee-(admissionFee*20/100);
        }
        else{
           return admissionFee;
        }
    }
    
    
    
}


public class Quiz3 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of the University");
        String universityName = sc.nextLine();
        System.out.println("Enter the admissionFee");
        double universityAdmissionFee=sc.nextDouble();
        System.out.println("Enter the Program type(e.g., Graduate): ");
        sc.nextLine();
        String universityProgramType=sc.nextLine();
        
        
        University university = new University(universityName, universityAdmissionFee, universityProgramType);
        
        System.out.println("Enter the name of the College: ");
        String collegeName = sc.nextLine();
        System.out.println("Enter the admissionFee");
        double collegeAdmissionFee=sc.nextDouble();
        System.out.println("Enter the number of Siblings: ");
        int numberOfSiblings=sc.nextInt();
        
      
        
        College college = new College(collegeName, collegeAdmissionFee, numberOfSiblings);
   
        System.out.println(university.toString());
        System.out.println("Calculated University admission fee: "+university.calculateFee());
        
        System.out.println(college.toString());
        System.out.println("Calculated college admission fee: "+college.calculateFee());
    }
    
}
