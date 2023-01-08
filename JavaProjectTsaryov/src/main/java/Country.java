public class Country {
    public String CountryOrArea;
    public String Subregion;
    public String Region;
    public long InternetUsers;
    public long Population;

    public void setInternetUsers(String internetUsers) {
        long x;
        try{
            x = Long.parseLong(internetUsers);
        }catch (NumberFormatException exception){
            x = 0;
        }
        InternetUsers = x;
    }

    public void setPopulation(String population) {
        long x;
        try{
            x = Long.parseLong(population);
        }catch (NumberFormatException exception){
            x = 0;
        }
        Population = x;
    }
}
