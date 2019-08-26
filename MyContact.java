package com.example.listviewimage;

public class MyContact {
    private String _ph;
    private String _name;
    private boolean _isFavorite;



    public MyContact(String ph, String name, boolean isFavorite)
    {
        this._ph = ph;
        this._name = name;
        this._isFavorite = isFavorite;
    }

    public String getPh()
    {
        return _ph;
    }

    public String getName()
    {
        return _name;
    }

    public boolean IsFavorite()
    {
        return _isFavorite;
    }


}
