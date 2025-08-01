package tp3ejercicio7;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import tp1ejercicio7.TestLinkedList;
import tp3ejercicio1.GeneralTree;


public class Caminos {
    private GeneralTree<Integer> arbol = new GeneralTree<>();
    public Caminos(GeneralTree<Integer> a){
        this.arbol=a;
    }
   
    public List<Integer> caminoAHojaMasLejana(){
        if(this.arbol.isEmpty())return null;
        else{
            List<Integer> lista=new LinkedList<>();
            List<Integer> camino=new LinkedList<>();
            
            Buscar(this.arbol,lista,camino);
            return camino;
        }
    }
    private void Buscar(GeneralTree<Integer> a,List<Integer> lista,List<Integer> camino){
        if(a.isLeaf()){
        	System.out.println(a.getData());
        	lista.add(a.getData());
            if(lista.size()>camino.size()){
                camino.clear();
                camino.addAll(lista);
            }
        }
        else{
            lista.add(a.getData());
            System.out.println("DATA ACT "+ a.getData()+"\n");
            
            for(GeneralTree<Integer> child: a.getChildren()){
                Buscar(child,lista,camino);
                lista.remove(lista.size()-1);
                ListIterator <Integer> act = lista.listIterator();
                while (act.hasNext()) System.out.println("CAM ACT" + act.next());
            }
            System.out.println("\n");
        }

    }
   
    public static void main (String[]args) {
   	        // Nivel 0
   	        GeneralTree<Integer> root = new GeneralTree<>(1);

   	        // Nivel 1
   	        GeneralTree<Integer> n2 = new GeneralTree<>(2);
   	        GeneralTree<Integer> n3 = new GeneralTree<>(3);
   	        root.addChild(n2);
   	        root.addChild(n3);

   	        // Nivel 2
   	        GeneralTree<Integer> n4 = new GeneralTree<>(4);
   	        GeneralTree<Integer> n5 = new GeneralTree<>(5);
   	        n2.addChild(n4);
   	        n2.addChild(n5);

   	        GeneralTree<Integer> n6 = new GeneralTree<>(6);
   	        GeneralTree<Integer> n8 = new GeneralTree<>(8);
   	        n3.addChild(n6);
   	        n3.addChild(n8);

   	        // Nivel 3
   	        GeneralTree<Integer> n9 = new GeneralTree<>(9);
   	        n4.addChild(new GeneralTree<>(6)); // hijo 1 de 4
   	        n4.addChild(n9);                   // hijo 2 de 4

   	        n6.addChild(new GeneralTree<>(18));
   	        n6.addChild(new GeneralTree<>(19));

   	        GeneralTree<Integer> n25 = new GeneralTree<>(25);
   	        n6.addChild(n25);

   	        GeneralTree<Integer> n32 = new GeneralTree<>(32);
   	        n8.addChild(n32);

   	        // Nivel 4
   	        n9.addChild(new GeneralTree<>(20));
   	        n9.addChild(new GeneralTree<>(21));
   	        n9.addChild(new GeneralTree<>(22));
   	        n9.addChild(new GeneralTree<>(23));

   	        n25.addChild(new GeneralTree<>(40));

   	        GeneralTree<Integer> n63 = new GeneralTree<>(63);
   	        n32.addChild(n63);
   	        
   	        Caminos c = new Caminos(root);
   	        
   	        
   	        
            ListIterator <Integer> act = c.caminoAHojaMasLejana().listIterator();
            while (act.hasNext()) System.out.println("CAM ACT" + act.next());
    }
}