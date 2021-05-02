
public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) {

		System.out.println("Egitmen Eklendi " + user.getUserName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Egitmen Silindi " + user.getUserName());
	}

	@Override
	public void update(User user) {

		System.out.println("Egitmen Güncellendi " + user.getUserName());
	}

}
