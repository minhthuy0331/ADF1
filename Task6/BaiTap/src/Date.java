public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        if(d>=1 && d<=31) {
            this.day = d;
        }else{
            System.out.println("Input Invalid");
        }
        if(m>=1 && m<=12) {
            this.month = m;
        }else {
            System.out.println("Input Invalid");
        }
        if(y>=1900 && y<=9999) {
            this.year = y;
        }else{
            System.out.println("Input Invalid");
        }
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int d) {
        if(d>=1 && d<=31) {
            this.day = d;
        }
    }
    public void setMonth(int m) {
        if(m>=1 && m<=12) {
            this.month = m;
        }
    }
    public void setYear(int y) {
        if(y>=1900 && y<=9999) {
            this.year = y;
        }
    }
    public void setDay(int d, int m, int y) {
        if(d>=1 && d<=31) {
            this.day = d;
        }
        if(m>=1 && m<=12) {
            this.month = m;
        }
        if(y>=1900 && y<=9999) {
            this.year = y;
        }
    }
    @Override
    public String toString() {
        return "'" + day + "/" + month +  "/" + year + "'";
    }

    // Test date
    public static void main(String[] args) {
        Date objDate = new Date(19, 4, 2022);
        System.out.println("Day: " + objDate.getDay());
        System.out.println("Month: " + objDate.getMonth());
        System.out.println("Year: " + objDate.getYear());
        System.out.println(objDate.toString());

        System.out.println("-----------");
        objDate.setDay(20);
        System.out.println("Day: " + objDate.getDay());
        objDate.setMonth(5);
        System.out.println("Month: " + objDate.getMonth());
        objDate.setYear(2022);
        System.out.println("Year: " + objDate.getYear());
        System.out.println(objDate.toString());

        System.out.println("--------------");
        objDate.setDay(22,10,2022);
        System.out.println(objDate.toString());
    }
}
