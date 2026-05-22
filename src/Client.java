class Client
{
    private int id;
    private String name;
    private String address;
    Client() {
        this.id = 0;
        this.name = "";
        this.address = "";
    }
    Client(int id, String name, String address)
    {
        this.name = name;
        this.id = id;
        this.address = address;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String toString()
    {
        return "ID: " + this.id + "Name: " + this.name + "Address: " +
                this.address;
    }

}