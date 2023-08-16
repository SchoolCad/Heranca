public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date(23, 02, 2007);

        Juridico person1 = new Juridico("Jorge", "Sim", date, "19.758.837/0001-22");
        Fisico person2 = new Fisico("Jorge", "Sim", date, "179.175.125-89");

        System.out.println(person1);
        
        System.out.println(person2);
    }
}