import com.dxc.practice.personrestapi.dataValidation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
public class Personvalid {

	@NotEmpty
	private String name;

	@NotEmpty
	private String email;

    @NotNull
    private LocalDate Dob;

    @NotEmpty
    private String address;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    public void setDob(String Dob) {
        this.Dob = LocalDate.parse(Dob);
    }
    
    public String getDob() {
        return Dob.toString();
    }
    
    public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String toString() {
		return "Person(Name: " + this.name + ", Dob: " + this.dob + ", Email: " + this.email + ",Dob: " + this.Dob +")";
	}
}