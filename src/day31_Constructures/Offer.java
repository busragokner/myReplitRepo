package day31_Constructures;

public class Offer {

    public String location ;
    public String companyName ;
    public String jobTitle ;
    public double salary ;
    public boolean hasBenefit ;
    public boolean hasPTO ;
    public boolean isFullTime ;
    public boolean WFH ;


    public void setInfo(String companyLocation, String comName, String comJobTitle, double jobSalary, boolean comBenefits, boolean comHasPTO, boolean jobIsWFH, boolean jobIsFullTime){
        this.location = companyLocation ;
        this.companyName = comName ;
        this.jobTitle = comJobTitle ;
        this.salary = jobSalary ;
        this.hasBenefit = comBenefits ;
        this.hasPTO = comHasPTO ;
        this.isFullTime = jobIsFullTime ;
        this.WFH = jobIsWFH ;









    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isFullTime=" + isFullTime +
                ", WFH=" + WFH +
                '}';
    }


}

