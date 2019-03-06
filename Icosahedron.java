package Icosahedron;


public class Icosahedron {
    private double edge;
    private static int count=0;

    public Icosahedron(double edge) {
        this.edge = edge;
        count++;
    }

    public double surface(){
        return 5*Math.sqrt(3) * edge * edge;
    }
    public double volume(){
        return 5*(3+Math.sqrt(5))/12 * edge * edge * edge;
    }

    @Override
    public String toString() {
        return String.format("Icosahedron[edge= %7.3f, surface= %7.3f, volume= %7.3f]", edge, surface(), volume());
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of Icosahedron objects created: " + getCount());
        Icosahedron[] icos = new Icosahedron[4];
        for (int each = 0; each < icos.length; each++)
            icos[each] = new Icosahedron(each+1);
        for (int each = 0; each < icos.length; each++)
            System.out.println(icos[each]);
        System.out.println("Number of Icosahedron objects created: " + getCount());
    }
}
