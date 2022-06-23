package pharmacy.system;

import java.util.ArrayList;

public class Pharmacy {
    private final String prodCategory;
    ArrayList<Products> prodList = new ArrayList<>();

    public Pharmacy(String prodCategory,ArrayList list) {
        this.prodCategory = prodCategory;
        prodList = list;
    }
    
    public Products getProduct (String name)
    {
        for (int i=0;i<prodList.size();i++)
        {
            Products p = prodList.get(i);
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }
    
    public int checkQuantity (String name)
    {
        for (int i=0;i<prodList.size();i++)
        {
            Products p = prodList.get(i);
            if (p.getName().equals(name))
                return p.getQuantity();
        }
        return -1;
    }
    
    public void addProduct (String name,int quan,int code,double price)
    {
        Products p = new Products(name, price, code, quan);
        prodList.add(p);
    }
    
    public Products codeProduct (int code)
    {
        for (int i=0;i<prodList.size();i++)
        {
            Products p = prodList.get(i);
            if (p.getCode()== code)
                return p;
        }
        return null;
    }
}
