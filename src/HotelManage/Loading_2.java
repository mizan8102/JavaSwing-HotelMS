
package HotelManage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mizanur Rahman
 */
public class Loading_2 {
    public static void main(String[] args) {
         Loading_Page lp=new  Loading_Page();
         lp.setVisible(true);
         for (int i = 0; i <=100; i++) {
             try {
                 Thread.sleep(40);
                 lp.number.setText(Integer.toString(i)+"%");
                 if(i==100){
                     lp.setVisible(false);
                      new Login().setVisible(true);
                 }
                 
                 
             } catch (InterruptedException ex) {
                 Logger.getLogger(Loading_2.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        }
    }
}
