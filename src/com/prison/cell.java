package com.prison;

public class cell {
        private String cellName;
        private Boolean isDoorOpen;
        private int securityCode;
    
        cell(String cellName, Boolean isDoorOpen, int securityCode){
            this.cellName = cellName;
            this.isDoorOpen = isDoorOpen;
            this.securityCode = securityCode;
        }

        public String getName (){
            return cellName;
        }

        public Boolean getIsDoorOpen(){
            return isDoorOpen;
        }

        public String setName (String newName){
            this.cellName = newName ; 
            return this.cellName;
        }

        public void setDoor (int securityCode){
            if (securityCode == this.securityCode){
                if (isDoorOpen == true){            //if security code true, door open / close
                    isDoorOpen = false;
                }else if (isDoorOpen == false){
                    isDoorOpen = true;
                }
            }else{
                System.out.println("Security code is incorrect");
            }
        }

}
