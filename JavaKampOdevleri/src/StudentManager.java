
public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {

		System.out.println("Ogrenci eklendi " + user.getUserName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Ogrenci silindi " + user.getUserName());
	}

	@Override
	public void update(User user) {

		System.out.println("Ogrenci guncellendi " + user.getUserName());
	}

}
