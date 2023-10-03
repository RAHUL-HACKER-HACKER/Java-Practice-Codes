
package EclipseJavaCodes;
//Warnsdorff's Algorithm for knight's tour problem
import java.util.*;
class Main60
{
    public int size;
    public int x;
    public int y;
    
    public static int[] move_cx = {1,1,2,2,-1,-1,-2,-2};
    public static int[] move_cy = {2,-2,1,-1,2,-2,1,-1};
    public Main60()
    {
        
        x = 0;
        y = 0;
        size = 8;
    }
  
    public boolean is_valid_move(int x, int y)
    {
        if ((x >= 0 && y >= 0) && (x < this.size && y < size))
        {
            return true;
        }
        return false;
    }
   
    public boolean is_empty(int[] out, int x, int y)
    {
        if ((is_valid_move(x, y)) && (out[y * this.size + x] < 0))
        {
            return true;
        }
        return false;
    }
    /*Returns the number of empty squares */
    public int getcount(int[] out, int x, int y)
    {
        int i, count = 0;
        for (i = 0; i < size; ++i)
        {
            if (is_empty(out, (x + move_cx[i]), (y + move_cy[i])))
            {
                count++;
            }
        }
        return count;
    }
    
    public boolean move_process(int[] out)
    {
        int start, count, i, flag = -1, c, min = (size + 1), nx, ny;
        start = (int)(Math.random() * ((size)));
        for (count = 0; count < size; ++count)
        {
            i = (start + count) % size;
            nx = this.x + move_cx[i];
            ny = this.y + move_cy[i];
            if ((is_empty(out, nx, ny)))
            {
                c = getcount(out, nx, ny);
                if (c < min)
                {
                    flag = i;
                    min = c;
                }
            }
        }
        if (min == size + 1)
        {
            return false;
        }
        nx = this.x + move_cx[flag];
        ny = this.y + move_cy[flag];
        //Assigns the counter
        out[ny * this.size + nx] = out[(this.y) * this.size + (this.x)] + 1;
        this.x = nx;
        this.y = ny;
        return true;
    }
    
    public void print_result(int[] out)
    {
        int i, j;
        for (i = 0; i < this.size; ++i)
        {
            for (j = 0; j < this.size; ++j)
            {
                System.out.print(out[j * this.size + i] + "\t");
            }
            System.out.print("\n");
        }
    }
   
    public boolean neighbour(int start_x, int start_y)
    {
        int i;
        for (i = 0; i < this.size; ++i)
        {
            if (((this.x + move_cx[i]) == start_x) && ((this.y + move_cy[i]) == start_y))
            {
                return true;
            }
        }
        return false;
    }
    
    public void set_default(int[] out)
    {
        
        for (int i = 0; i < size * size; ++i)
        {
            out[i] = -1;
        }
    }
    
    public boolean generate(int[] out)
    {
        set_default(out);
        int i, sx, sy;
        
        sx = (int)(Math.random() * ((size)));
        sy = (int)(Math.random() * ((size)));
        this.x = sx;
        this.y = sy;
        
        out[this.y * size + this.x] = 1;
        for (i = 0; i < (size * size) - 1; ++i)
        {
            if (move_process(out) == false)
            {
                return false;
            }
        }
        
        if (neighbour(sx, sy) == false)
        {
            return false;
        }
        
        print_result(out);
        return true;
    }
    public static void main(String[] args)
    {
    	Main60 obj = new Main60();
        
        int[] out = new int[obj.size * obj.size];
        while (!obj.generate(out));
    }
}