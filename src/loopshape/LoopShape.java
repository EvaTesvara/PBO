package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        int lebar = width;
        int spasi = lebar - 2 ; 
        int tinggi = height - 2; 


        for(int i=0 ; i<lebar ; i++){
            System.out.print("#");
        }


        for(int i=0 ; i<tinggi ; i++){
            
            System.out.print("\n#"); //println skip space in next line not this line, to skip for this line, use \n instead -_-

            for(int j=0; j<spasi ; j++){
            System.out.print(" ");
            }

            System.out.print("#");
        }


        System.out.println();


        for(int i=0 ; i<lebar ; i++){
            System.out.print("#");
        }
        
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        int sisiBerdiri = leg - 1; 


        //# berdiri dan space in between
        for(int i=0; i<sisiBerdiri ; i++){
            System.out.print("\n#");

            if(i<1){
                continue;  //first line can only contain 1 #, skip loop if its first line
            }
            
            for(int j=0; j<i-1 ; j++){
                if(i<=1){
                    continue;  //baris pertama dan kedua untuk segitiga tidak ada spasi, continue
                }
                System.out.print(" ");
            }

            System.out.print("#"); //else print #

        }

        System.out.println();

        //alas segitiga
        for(int i=0 ; i<leg ; i++){
            System.out.print("#");
        }
        
    }
}
