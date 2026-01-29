public class StudentTable2 {
    public static void main(String[] args) {
        String[][] data = {
            {"SHOWRAV GHOSH", "101", "A", "Computer Science"},
            {"ABTAHI ISLAM", "102", "B", "Electrical Engineering"},
            {"MD RIFAT HASAN", "103", "C", "Mechanical Engineering"},
            {"NILADRI ROY NILOY", "104", "D", "Chemistry"},
            {"GOPAL VHAR", "105", "E", "Physics"}
        };
        
        printTable(data);
    }
    
    public static void printTable(String[][] data) {
        String headerColor = "\u001B[45m"; 
        String dataColor = "\u001B[44m"; 
        String resetColor = "\u001B[0m"; 
        
        
        System.out.println(headerColor + "STUDENT_NAME\tID\tSECTION\tDEPARTMENT" + resetColor);
        
        
        for (String[] row : data) {
            System.out.println(dataColor + row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3] + resetColor);
        }
    }
}
