/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author Paarkavi Saravanan
 */
public class decimel_scientific extends JFrame implements ActionListener {
    JTextField t;
    double temp,temp1,result,a;
    static double m1,m2;
    int k=1,x=0,y=0,z=0;
    char ch;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,zero,clr,pow2,pow3,exp,fac,plus,min,div,log,rec,mul,eq,addSub,dot,mr,mc,mp,mm,sqrt,sin,cos,tan;
    Container c;
    JPanel textPanel,buttonpanel;
    decimel_scientific()
    {
        c=getContentPane();
        c.setLayout(new BorderLayout());
        JPanel textpanel=new JPanel();
        t=new JTextField(25);
        t.setHorizontalAlignment(SwingConstants.RIGHT);
        t.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent keyevent)  
            {
                char c = keyevent.getKeyChar();
             
            if (c >= '0' && c <= '9'){ } 
            else
            {
            keyevent.consume();

           } 
            
        }
        
        
    });
        //adding button(numbers,symbols) and textpanel (for displaying)
textpanel.add(t); 
buttonpanel = new JPanel();
//usage of gridlayout for button and panel layout
buttonpanel.setLayout(new GridLayout(8, 4, 2, 2));
boolean t = true;
mr = new JButton("MR");
buttonpanel.add(mr); 
mr.addActionListener(this); 
mc = new JButton("MC"); 
buttonpanel.add(mc); 
mc.addActionListener(this); 
mp = new JButton("M+"); 
buttonpanel.add(mp); 
mp.addActionListener(this); 
mm = new JButton("M-"); 
buttonpanel.add(mm); 
mm.addActionListener(this); 
b1 = new JButton("1"); 
buttonpanel.add(b1); 
b1.addActionListener(this); 
b2 = new JButton("2"); 
buttonpanel.add(b2); 
b2.addActionListener(this); 
b3 = new JButton("3"); 
buttonpanel.add(b3); 
b3.addActionListener(this); 
b4 = new JButton("4"); 
buttonpanel.add(b4); 
b4.addActionListener(this); 
b5 = new JButton("5"); 
buttonpanel.add(b5); 
b5.addActionListener(this); 
b6 = new JButton("6"); 
buttonpanel.add(b6); 
b6.addActionListener(this); 
b7 = new JButton("7"); 
buttonpanel.add(b7); 
b7.addActionListener(this); 
b8 = new JButton("8"); 
buttonpanel.add(b8); 
b8.addActionListener(this); 
b9 = new JButton("9"); 
buttonpanel.add(b9); 
b9.addActionListener(this); 
zero = new JButton("0"); 
buttonpanel.add(zero); 
zero.addActionListener(this); 
plus = new JButton("+"); 
buttonpanel.add(plus); 
plus.addActionListener(this); 
min = new JButton("-"); 
buttonpanel.add(min); 
min.addActionListener(this); 
mul = new JButton("*"); 
buttonpanel.add(mul); 
mul.addActionListener(this); 
div = new JButton("/"); 
div.addActionListener(this); 
buttonpanel.add(div); 
addSub = new JButton("+/-"); 
buttonpanel.add(addSub);
addSub.addActionListener(this);
dot = new JButton(".");
buttonpanel.add(dot); 
dot.addActionListener(this);
eq = new JButton("="); 
buttonpanel.add(eq);
eq.addActionListener(this);
rec = new JButton("1/x");
buttonpanel.add(rec);
rec.addActionListener(this); 
sqrt = new JButton("Sqrt");
buttonpanel.add(sqrt); 
sqrt.addActionListener(this);
log = new JButton("log");
buttonpanel.add(log);
log.addActionListener(this);
sin = new JButton("SIN");
buttonpanel.add(sin);
sin.addActionListener(this);
cos = new JButton("COS");
buttonpanel.add(cos);
cos.addActionListener(this);
tan = new JButton("TAN");
buttonpanel.add(tan);
tan.addActionListener(this);
pow2 = new JButton("x^2");
buttonpanel.add(pow2); 
pow2.addActionListener(this);
pow3 = new JButton("x^3");
buttonpanel.add(pow3); 
pow3.addActionListener(this);
exp = new JButton("Exp"); 
exp.addActionListener(this); 
buttonpanel.add(exp);
fac = new JButton("n!");
fac.addActionListener(this);
buttonpanel.add(fac); 
clr = new JButton("AC");
buttonpanel.add(clr); 
clr.addActionListener(this); 
c.add("Center", buttonpanel);
c.add("North", textpanel); 
//closing of frame
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
    public void actionPerformed(ActionEvent e)  {
        String s = e.getActionCommand();
//checking of entered text    
if (s.equals("1")) 
{
    
    if (z == 0)  
    { 
        t.setText(t.getText() + "1");
    } 
  
else 
{ 
    t.setText("");
    t.setText(t.getText() + "1"); 
    z = 0; 
} 
}
    
if (s.equals("2")) 
{ 
    if (z == 0) 
{
    t.setText(t.getText() + "2"); 
} 
     else 
    { 
    t.setText(""); 
    t.setText(t.getText() + "2");
    z = 0; 
}
}
if (s.equals("3")) 
{
    if (z == 0) { 
        t.setText(t.getText() + "3");
    } 
else 
{
    t.setText(""); 
    t.setText(t.getText() + "3"); 
    z = 0; 
} 
}
if (s.equals("4")) 
{ 
    if (z == 0) 
    { 
        t.setText(t.getText() + "4"); 
    } 
    else 
    { 
        t.setText(""); 
        t.setText(t.getText() + "4"); 
        z = 0; 
    } 
} 
if (s.equals("5")) 
{ 
    if (z == 0) {
        t.setText(t.getText() + "5");
        
}

else 
{ 
    t.setText(""); 
    t.setText(t.getText() + "5"); 
    z = 0; 
}
}
    

    
if (s.equals("6")) 
{ 
    if (z == 0) 
    { 
        t.setText(t.getText() + "6"); 
    } 
    else
    { 
        t.setText(""); 
        t.setText(t.getText() + "6"); 
        z = 0; 
    } 
}

if (s.equals("7")) 
{ 
    if (z == 0) 
    {
    t.setText(t.getText() + "7");     
    }
    else 
    { 
        t.setText(""); 
        t.setText(t.getText() + "7");
        z = 0;
    }
} 
if (s.equals("8")) 
{ 
    if (z == 0) 
    { 
        t.setText(t.getText() + "8");
    } 
    else 
    { t.setText(""); 
    t.setText(t.getText() + "8");
    z = 0; 
    } 
} 
if     (s.equals("9")) 
{ 
    if (z == 0) 
    { 
        t.setText(t.getText() + "9"); 
    } 
    else 
    { 
        t.setText(""); 
        t.setText(t.getText() + "9"); 
        z = 0; 
    } 
} 
if (s.equals("0"))  
{ 
    if (z == 0) 
    { 
        t.setText(t.getText() + "0"); 
    } 
    else
    { 
        t.setText("");
        t.setText(t.getText() + "0");
        z = 0;
    } 
} 
if (s.equals("AC")) 
{ 
    t.setText("");
x = 0; 
y = 0;  
z = 0; 
} 
if (s.equals("log"))  
{ 
    if (t.getText().equals("")) 
    { 
        t.setText(""); 
    }  
    else  
    { 
        a = Math.log(Double.parseDouble(t.getText())); 
        t.setText(""); 
        t.setText(t.getText() + a); 
    } 
} 
if (s.equals("1/x")) 
{ 
    if (t.getText().equals("")) 
    { 
        t.setText("");
}
else
{ 
    a = 1 / Double.parseDouble(t.getText()); 
    t.setText(""); 
    t.setText(t.getText() + a); 
} 
} 
if (s.equals("Exp")) 
{ 
    if (t.getText().equals("")) 
{ 
    t.setText(""); 
}  
else 
{ 
    a = Math.exp(Double.parseDouble(t.getText()));
    t.setText(""); 
    t.setText(t.getText() + a); 
}
} 
if (s.equals("x^2")) 
{ 
    if (t.getText().equals("")) 
    { 
        t.setText(""); 
    } 
    else 
    { 
        a = Math.pow(Double.parseDouble(t.getText()), 2);
        t.setText(""); 
        t.setText(t.getText() + a); 
    } 
} 
if (s.equals("x^3")) 
{ 
    if (t.getText().equals("")) 
    { 
        t.setText(""); 
    }  
    else 
    { 
        a = Math.pow(Double.parseDouble(t.getText()), 3); 
        t.setText(""); 
        t.setText(t.getText() + a); 
    }
}
if (s.equals("+/-")) 
{ 
    if (x == 0) 
{ 
    t.setText("-" + t.getText()); 
    x = 1; 
}  
else 
{ 
    t.setText(t.getText()); 
} 
} 
if (s.equals(".")) 
{ 
    if (y == 0) 
    { 
        t.setText(t.getText() + "."); 
        y = 1; 
    } 
    else 
    { 
        t.setText(t.getText()); 
    } 
} 
if (s.equals("+"))  
{ 
    if (t.getText().equals(""))  
    { 
        t.setText(""); 
        temp = 0; 
        ch = '+'; 
    }
    else 
    { 
        temp = Double.parseDouble(t.getText()); 
        t.setText(""); 
        ch = '+'; 
        y = 0; 
        x = 0; 
    } 
    t.requestFocus(); 
} 
if (s.equals("-"))  
{ 
    if (t.getText().equals(""))  
{ 
    t.setText(""); 
    temp = 0; 
    ch = '-'; 
}  
else  
{ 
    x = 0; 
    y = 0; 
    temp = Double.parseDouble(t.getText()); 
    t.setText(""); 
    ch = '-'; 
} 
t.requestFocus(); 
} 
if (s.equals("/")) 
{ 
    if (t.getText().equals(""))  
    { 
        t.setText(""); 
        temp = 1; 
        ch = '/'; 
    }  
    else 
    { 
        x = 0; 
        y = 0; 
        temp = Double.parseDouble(t.getText()); 
        ch = '/'; 
        t.setText(""); 
    } 
    t.requestFocus(); 
} 
if (s.equals("*")) 
{ 
    if (t.getText().equals(""))  
    { 
        t.setText("");
     
    temp = 1; 
    ch = '*'; 
}  
else  
{ 
    x = 0; 
    y = 0; 
    temp = Double.parseDouble(t.getText()); 
    ch = '*'; 
    t.setText(""); 
} 
t.requestFocus(); 
} 
//MC ==> Memory Clear sets the memory to zero
if (s.equals("MC"))  
{ 
    m1 = 0;
    t.setText(""); 
} 
//MR ==> Memory Recall uses the number in memory
if (s.equals("MR"))  
{ 
    t.setText("");

t.setText(t.getText() + m1); 
}  
//M+ ==>Memory Add takes the number on the display,adds it to the memory ,and puts the result into the memory
    if (s.equals("M+"))  
    { 
        if (k == 1) 
    { 
        m1 = Double.parseDouble(t.getText());
     
        k++; 
    }
    else  
    { 
        m1 += Double.parseDouble(t.getText());
        t.setText("" + m1); 
    } 
    }
    
  //M- ==> Memory Subtract the current value from the stored value in the memory register   
if (s.equals("M-"))  
{ 
    if (k == 1) 
    { 
        m1 = Double.parseDouble(t.getText());
        k++; 
    }  
    else  
    { 
        m1 -= Double.parseDouble(t.getText()); 
        t.setText("" + m1); 
    } 
} 
//Sqrt==> squares the given value
if (s.equals("Sqrt"))  
{ if (t.getText().equals(""))  
{
    t.setText("");
} 
else 
{ 
    a = Math.sqrt(Double.parseDouble(t.getText())); 
    t.setText(""); 
    t.setText(t.getText() + a); 
} 
} 
// SIN,COS,TAN==> trignometric ratios
if (s.equals("SIN"))  
{ 
    if (t.getText().equals(""))  
    { 
        t.setText("");
}
  
else 
{ 
    a = Math.sin(Double.parseDouble(t.getText())); 
    t.setText(""); 
    t.setText(t.getText() + a); 
}
}
     
if (s.equals("COS"))  
{ 
    if (t.getText().equals(""))  
    { 
        t.setText("");
    } 

else
{ 
    a = Math.cos(Double.parseDouble(t.getText()));
    t.setText(""); 
    t.setText(t.getText() + a); 
}
}
     
if (s.equals("TAN")) 
    { 
        if (t.getText().equals("")) 
        { 
            t.setText("");
        }
      
else 
{ 
    a = Math.tan(Double.parseDouble(t.getText())); 
    t.setText(""); 
    t.setText(t.getText() + a); 
} 
    }
     //equals operator is performed here
if (s.equals("="))  
{ 
    if (t.getText().equals(""))  
    { 
        t.setText("");
    } 

else 
{ 
    temp1 = Double.parseDouble(t.getText()); 
switch (ch)  
{ 
    case '+': 
    result = temp + temp1; 
    break; 
case '-': 
    result = temp - temp1; 
    break; 
case '/':
    result = temp / temp1;
    break; 
case '*': 
    result = temp * temp1; 
    break; 
} 
t.setText(""); 
t.setText(t.getText() + result); 
z = 1; 
}
}    
if (s.equals("n!"))  
{ 
    if (t.getText().equals(""))  
    { 
        t.setText(""); 
    } 
    else 
    { 
        a = fact(Double.parseDouble(t.getText())); 
        t.setText(""); 
        t.setText(t.getText() + a); 
    } 
} 
/*requestFocus()==>makes a request that the given  component getsset focused state,used mainly for 
dispalyable,focusable,visible and all of its ancestor to be visible...
*/
t.requestFocus(); 
    }
    double fact(double x)  
    { 
        int er = 0; 
        if (x < 0)  
        { 
            er = 20; 
            return 0; 
        } 
        double i, s = 1; 
        for (i = 2; i <= x; i += 1.0) 
            s *= i; 
        return s; 
    } 
    public static void main(String args[])  {                    
        try                   
        { 
            //here UIManager.setLookAndFeel==>for better look and feel (for better performance efficiency)
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }     
        catch (Exception e)      
        {      
        }     
        decimel_scientific f = new decimel_scientific();    
        f.setTitle("ScientificCalculator");    
        f.pack();    
        f.setVisible(true);        
    } 
}







    
    
    
    
    
    
    
    


