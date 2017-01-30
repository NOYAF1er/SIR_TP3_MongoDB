package istic.sir.tp3;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.query.Query;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws UnknownHostException {
		Morphia morphia = new Morphia();
		Mongo mongo = new Mongo();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");
				
		/*String[] noms = {"Jhon", "Jane", "Titi", "Smith", "Albert", "Einstein", "zac", "Toto", "Gregoire", "Bernard"};
		
		for(int i = 0; i < 10; i++){
			Person p = new Person();
			p.setName(noms[i]);
			
			Address address = new Address();
			address.setStreet("12"+i+" Some street");
			address.setCity("Some city");
			address.setPostCode("123 456"+i*10);
			address.setCountry("Some country");
			
			// set address
			p.setAddress(address);
			
			// Save the POJO
			ds.save(p);
		}
		*/

		Query<Person> query = ds.createQuery(Person.class);
		//query.filter("name =", "Tintin");
		//query.field("name").equal("Tintin").field("address.country").equal("Some country");
		/*query.and(
				query.criteria("name").equal("Tintin"),
				query.criteria("address.country").equal("Some country")
			);*/
		
		
		for (Person e : query)
			System.err.println(e);
			
	}
}
