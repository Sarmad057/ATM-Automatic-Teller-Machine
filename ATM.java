package atm;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ATM
{
 
 public static char a;
 public static int mon1, z=0, e;
 public static Scanner input=new Scanner(System.in);
 public static  JFrame frame = new JFrame(); 
 public static String pin, acc_no;
 public static String [][]arr=new String[100][4];
                   
                       
                   
                    
                                   
 public static void main(String[] args)
 {      
      int c;        
  do{  
      c=0;      
      System.out.println("\tAlready Regigtered (Enter 1)\n\tCreate a new account(Enter 0) ");
      a=input.next().charAt(0);
             
               
                
      if (a=='1')
      {  
                         
       ask_data();                   
       int f1=0;               
       for(e=0; e<z; e++){
           if(arr[z][0].equals(arr[e][0])){
             if(arr[z][1].equals(arr[e][1])){
               if(arr[z][2].equals(arr[e][2])){
                                               f1 = 1;
                                               break;
                                              }
                                            }
                                          }
       
                             }
                                                    
        if(f1==1){  
                   char t;       
                   do{
                      
                      System.out.println("\n\tTransaction Type? \n\n\tWithdrawal(Enter 1) \n\tDeposit(Enter 2)\n\tBalance inquiry(Enter 3): \n ");
                      t=input.next().charAt(0);
                      int mon_strd , mon_entrd;               
                      if(t=='1'){
                                 int f;
                                 String mon="0";
                                 char tran;
                                 do{
                                    f=1;
                                    mon_entrd=0; 
                                    mon_strd=0; 
                                    mon_strd=Integer.parseInt(arr[e][3]);
                                    System.out.println("Enter the money you want to withdraw: ");
                                    System.out.println("\n\t(Enter 0)Rs. 500\t\t\t\tRs. 20000(Enter 5)");
                                    System.out.println("\t(Enter 1)Rs. 1000\t\t\t\tRs. 25000(Enter 6)");
                                    System.out.println("\t(Enter 2)Rs. 5000\t\t\t\tRs. 50000(Enter 7)");
                                    System.out.println("\t(Enter 3)Rs. 10000\t\t\t\tAnother amount(Enter 8)");
                                    System.out.println("\t(Enter 4)Rs. 15000\t\t\t\tBalance Inquiry(Enter 9)");
                                    tran=input.next().charAt(0);
                                    
                                    if(tran=='0')
                                    mon="500";
                                    else if(tran=='1')
                                    mon="1000";
                                    else if(tran=='2')
                                    mon="5000";
                                    else if(tran=='3')
                                    mon="10000";
                                    else if(tran=='4')
                                    mon="15000";
                                    else if(tran=='5')
                                    mon="20000";
                                    else if(tran=='6')
                                    mon="25000";
                                    else if(tran=='7')
                                    mon="50000";
                                    else if(tran=='8'){
                                    mon= JOptionPane.showInputDialog(frame, "Enter amount: ");
                                     
                                     for(int i=0; i<mon.length(); i++){
                                                                        char cr=mon.charAt(i);
                                                                        if(!Character.isDigit(cr))
                                                                        {f=0;
                                                                        break;} 
                                                                     } 
                                    }
                                    else if(tran=='9')
                                       JOptionPane.showMessageDialog(frame,"\n\t\t\tAvailable balance: "+mon_strd+"\n\t\t\tThanks for using ATM\n");
                                         
                                    else if((tran!='1') && (tran!='2') && (tran!='3') && (tran!='4') && (tran!='5') && (tran!='6') && (tran!='7') && (tran!='8') && (tran!='9'))
                                        JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE);                                        
                                    
                                    
                                    
                                    if (f==1)
                                             {
                                             mon_entrd=Integer.parseInt(mon);
                                             
                                             if(tran!='9' && (mon_strd-mon_entrd)>=500){
                                                                            arr[e][3] =""+(mon_strd-mon_entrd);
                                                                            JOptionPane.showMessageDialog(frame, "\n\t\t\tWithdrawn amount: Rs. "+mon_entrd+"\n\t\t\tAvailable balance: Rs."+(mon_strd-mon_entrd)+"\n\t\t\tThanks for using ATM\n");
                                                                           }
                                             
                                                    
                                             else if((mon_strd-mon_entrd)<500)
                                                {
                                                 JOptionPane.showMessageDialog(frame, "\t\t\tAvailable balance: Rs. "+(mon_strd)+".  Transaction is not allowed because there should be minimum Rs.500 in your account and your transaction is out of range.\n Try some other amount", "Inane warning", JOptionPane.WARNING_MESSAGE);
                                                }
                                                
                                          
                                            
                                             }
                                    else
                                        JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
                                             
                                   }while((tran!='1') && (tran!='2') && (tran!='3') && (tran!='4') && (tran!='5') && (tran!='6') && (tran!='7') && (tran!='8') && (tran!='0') || (f==0) || ((mon_strd-mon_entrd)<500));    
                                      
                                }       
                                 
                                             
                                        
                                    
                                    
                                                                 
                       else if(t=='2'){   
                                       int f;
                                       do{  
                                           mon_entrd=0;
                                           mon_strd=0;                                      
                                           String dep= JOptionPane.showInputDialog(frame, "Enter amount: ");
                                           
                                           f=1;
                                           for(int i=0; i<dep.length(); i++){
                                                                             char cr=dep.charAt(i);
                                                                             if(!Character.isDigit(cr)){f=0;
                                                                                                      break;}
                                                                            }
                                           if(f==1){
                                                    mon_strd=Integer.parseInt(arr[e][3]);
                                                    mon_entrd=Integer.parseInt(dep);
                                                    arr[e][3]=""+(mon_strd+mon_entrd);
                                                    JOptionPane.showMessageDialog(frame, "\n\t\t\tDeposited amount: Rs. "+mon_entrd+"\n\t\t\tAvailable balance: Rs."+(mon_strd+mon_entrd)+"\n\t\t\tThanks for using ATM\n");
                                                   } 
                                         }while(f==0);   
                                      
                                                                                  
                                                                      
                                      }
                       else if(t=='3'){
                                       mon_strd=Integer.parseInt(arr[e][3]);
                                       JOptionPane.showMessageDialog(frame, "\t\t\tAvailable balance: Rs. "+mon_strd+"\n\t\t\tThanks for using ATM\n");
                                       
                                       
                                      }
                                      
                       else
                           JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE);
                      }while(t!='1' && t!='2' && t!='3');
                 }          
                           
          else         
           JOptionPane.showMessageDialog(frame, "Sorry!! You are not registered in our bank", "Inane warning", JOptionPane.WARNING_MESSAGE);    
           System.out.println("\n");                         
      }                            
                                      
                              
                               
                                  
                                 
      else if(a=='0')
      {
       if(z<99)
       {
        System.out.println("\n        Give the required information        \n");          
        ask_data();
        
        JOptionPane.showMessageDialog(frame, "Congratulations!! Your account is created successfully and your Account number is "+arr[z][0]);
        JOptionPane.showMessageDialog(frame, "\n\t\t\tDeposited amount: Rs. "+mon1+"\n\t\tAvailable balance: Rs.  "+mon1+"\n\t\t\tThanks for using ATM\n");
        z++;   
       }
       else
        JOptionPane.showMessageDialog(frame, "Registration Full", "Inane warning", JOptionPane.WARNING_MESSAGE);
        System.out.println("\n");       
      }
                 
          
             
     else
        JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
        
    }while(c<1);       
            
              
 }
       
       
          
           
      
            
           
          
             
              
             
               
                 
  public static String[][] ask_data()
    
                         
     {
                         
      int flag;
          do{
             flag=0; 
             if(a=='1')
             { 
             do{
                acc_no = JOptionPane.showInputDialog(frame, "Please enter your 10 digit Account no(e.g. 1234567891):");
                if(acc_no.length()!=10)
                JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
               }while(acc_no.length()!=10);
               
             } 
           if(a=='0'){
                      int fa;
                      do{
                      fa=1;
         
                      String str=""+gen();
                      acc_no = String.format("%10s", str).replace(' ' , '0');
                      for(int s=0; s<=z; s++)
                      {if(acc_no==arr[s][0])
                       {fa=0;
                       break;}}
                        }while(fa==0);
                     } 
               for(int i=0; i<10; i++){
                                       char cr=acc_no.charAt(i);
                                       if(!Character.isDigit(cr))
                                       {flag=1;
                                        break;}
                                       }
                       
               if(flag==0){
                                     
                              int f;    
                              do{     
                                      
                                      do{
                                      f=0;
                                      pin = JOptionPane.showInputDialog(frame, "Enter 4 digit PIN code: ");
                                      if(pin.length()!=4)
                                      JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
                                      }while(pin.length()!=4);
                                      for(int i=0; i<4; i++){
                                                               char cr=pin.charAt(i);
                                                               if(!Character.isDigit(cr))
                                                               {f=1;
                                                                break;}
                                                             }
                                      
                                      if(f==1)
                                      {   
                                       JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
                                      }      
                                          
                                      
                                }while(pin.length()!=4 || f==1); 
                                                             
                                     
                           }
               else
                   JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
         }while(acc_no.length()!=10 || flag==1);
                        
          arr[z][0] = acc_no; 
          arr[z][1] = pin;
          
          char acc;
          do{
             System.out.println("\n\tAccount type?");
             System.out.println("\n\t(Enter 1)Saving\n\t(Enter 2)Current\n\t(Enter 3)Fixed ");
             acc = input.next().charAt(0);
             if(acc=='1' || acc=='2' || acc=='3'){
             arr[z][2] =""+acc ;}
             else
                JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
             
                  
            }while(acc!='1' && acc!='2' && acc!='3');
          
         if(a=='0')
         {
         int f;
          mon1=0;
          do{ 
             f=0;
             System.out.println("Enter the money that you want to deposit 1st time... Remember that it should be minimum Rs.500: ");
             String money1=input.next();
             for(int i=0; i<money1.length(); i++){
                                                 char cr=money1.charAt(i);
                                                 if(!Character.isDigit(cr)){f=1;
                                                                           break;}                                
                                                 }
             if(f==0){
                      mon1=Integer.parseInt(money1);
              
                      if(mon1>=500){
                                      arr[z][3]=money1;
                                   }
                      else
                         JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
                     }
             else
                JOptionPane.showMessageDialog(frame, "Wrong Input... Try Again", "Inane warning", JOptionPane.WARNING_MESSAGE); 
            }while(mon1<500 || f==1);
         }
         
          return arr;
          
                 
    }







 public static int gen() 
 {
    Random r = new Random(System.currentTimeMillis());
    return 0000000000 + r.nextInt(2000000000);
 }







}