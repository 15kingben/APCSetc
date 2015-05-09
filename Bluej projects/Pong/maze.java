import java.applet.*;
import java.awt.*;

public class maze extends Applet implements Runnable
{
    private Thread   m_maze = null;
    int xdim;
    int ydim;
    int xsize=900;
    int ysize=500;
    int[][] cell=new int[200][100];
    int[][] path=new int[200][100];
    int[][] deadend=new int[1000][2];
//  TextArea ta=new TextArea("getting text",5,60);
    String str;
    int level=0;
    int maxlevel=0;
    int endx;
    int endy;
    int maxdepth;
    TextField xfield,yfield,tfpixel;
    Label xlabel,ylabel,lpixel;
    Button but1;

    public maze()
    {
    }

    public void init()
    {
        resize(xsize,ysize);
        setBackground(Color.white);
        setLayout(null);
//      add(ta);
//      ta.reshape(500,300,400,100);
        xfield=new TextField("10",5);
        add(xfield);
        yfield=new TextField("10",5);
        add(yfield);
        tfpixel=new TextField("900",5);
        add(tfpixel);
        xlabel=new Label("Width");
        ylabel=new Label("Height");
        lpixel=new Label("Pixels");
        add(xlabel);
        add(ylabel);
        add(lpixel);
        but1=new Button("submit");
        add(but1);
        xlabel.reshape(50,ysize-25,50,20);
        xfield.reshape(100,ysize-25,50,20);
        ylabel.reshape(200,ysize-25,50,20);
        yfield.reshape(250,ysize-25,50,20);
        ylabel.reshape(200,ysize-25,50,20);
        yfield.reshape(250,ysize-25,50,20);
        lpixel.reshape(350,ysize-25,50,20);
        tfpixel.reshape(400,ysize-25,50,20);
        but1.reshape(500,ysize-25,50,20);
    }


    public boolean action(Event evt, Object arg)
    {
        if (evt.target instanceof Button)
        {
            xdim=Integer.parseInt(xfield.getText());
            ydim=Integer.parseInt(yfield.getText());
            maxdepth=xdim*ydim*3/2;
            xsize=Math.min(900,Math.max(600,Integer.parseInt(tfpixel.getText())));
            ysize=xsize*5/9;
            resize(xsize,ysize);
            xlabel.reshape(50,ysize-25,50,20);
            xfield.reshape(100,ysize-25,50,20);
            ylabel.reshape(200,ysize-25,50,20);
            yfield.reshape(250,ysize-25,50,20);
            ylabel.reshape(200,ysize-25,50,20);
            yfield.reshape(250,ysize-25,50,20);
            lpixel.reshape(350,ysize-25,50,20);
            tfpixel.reshape(400,ysize-25,50,20);
            but1.reshape(500,ysize-25,50,20);
            setarray();
            return true;
        }
        else
            return false;
    }

    public void paint(Graphics g)
    {
        if ((xdim>0)&&(ydim>0))
        {
            int size=(int)(Math.min((float)((xsize-1)/xdim),(float)((ysize-26)/ydim)));
            g.setColor(Color.black);
            for (int i=0; i=1)
                        g.drawLine(i*size,j*size,(i+1)*size,j*size);
                    if (cell[i][j]%4>=2)
                        g.drawLine((i+1)*size,j*size,(i+1)*size,(j+1)*size);
                    if (cell[i][j]%8>=4)
                        g.drawLine(i*size,(j+1)*size,(i+1)*size,(j+1)*size);
                    if (cell[i][j]%16>=8)
                        g.drawLine(i*size,j*size,i*size,(j+1)*size);
                }
            }
            g.setColor(Color.red);
            g.fillOval(endx*size,endy*size,size,size);
        }
    }

    public void setarray()
    {
//      str=null;
        maxlevel=0;
        maxlevel=0;
        level=0;
        for (int i=0; i=20)&&(ydim>=20))
        {
            for (int i=xhole1-1; i0) /* move up */
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                    cell[x][y]+=1;
        }
        else if ((r==2)||(r==3))
        {
            if (x+10) /* move up */
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
        }
        else if ((r==0)||(r==5))
        {
            if (x+10) /* move up */
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                    cell[x][y]+=1;
        }
        else if ((r==1)||(r==4))
        {
            if (x+10) /* move up */
            {
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
            }
        }
        else if ((r==2)||(r==3))
        {
            if (x>0) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
        else if ((r==4)||(r==5))
        {
            if (y+10) /* move up */
            {
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
            }
        }
        else if ((r==0)||(r==5))
        {
            if (x>0) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
        else if ((r==1)||(r==3))
        {
            if (y+10) /* move up */
            {
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
            }
        }
        else if ((r==1)||(r==4))
        {
            if (x>0) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
        else if ((r==0)||(r==2))
        {
            if (y+10) /* move up */
            {
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
            }
        }
        else if ((r==2)||(r==3))
        {
            if (x+10) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
//      Second step
        if ((r==2)||(r==4))
        {
            if (y>0) /* move up */
            {
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
            }
        }
        else if ((r==0)||(r==5))
        {
            if (x+10) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
//      Third step
        if ((r==3)||(r==5))
        {
            if (y>0) /* move up */
            {
                if (path[x][y-1]==0)
                {
                    level++;
                    moveup(x,y-1);
                    level--;
                }
                else
                {
                    cell[x][y]+=1;
                }
            }
        }
        else if ((r==1)||(r==4))
        {
            if (x+10) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
        if (cell[x][y]==11)
            update(x,y);
    }

    public void movedown(int x, int y)
    {
        path[x][y]=1;
        int r=(int)(Math.random()*6);
//      First step
        if ((r==0)||(r==1))
        {
            if (y+10) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
//      Second step
        if ((r==2)||(r==4))
        {
            if (y+10) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
//      Third step
        if ((r==3)||(r==5))
        {
            if (y+10) /* move left */
            {
                if (path[x-1][y]==0)
                {
                    level++;
                    moveleft(x-1,y);
                    level--;
                }
                else
                {
                    cell[x][y]+=8;
                }
            }
        }
        if (cell[x][y]==14)
            update(x,y);
    }

    public void update(int x, int y)
    {
        if (level>maxlevel)
        {
            endx=x;
            endy=y;
            maxlevel=level;
        }
    }

    public void start()
    {
        if (m_maze == null)
        {
            m_maze = new Thread(this);
            m_maze.start();
        }
    }

    public void stop()
    {
        if (m_maze != null)
        {
            m_maze.stop();
            m_maze = null;
        }
    }

    public void run()
    {
    }
}