package mikefallonit.workrecord.models;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private long contact_number;
    private String address_line;
    private String region;
    private String city;
    private String postcode;

    public Customer(String name, String email, long contact_number, String address_line, String region, String city, String postcode) {
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
        this.address_line = address_line;
        this.region = region;
        this.city = city;
        this.postcode = postcode;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact_number() {
        return contact_number;
    }

    public void setContact_number(long contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress_line() {
        return address_line;
    }

    public void setAddress_line(String address_line) {
        this.address_line = address_line;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
