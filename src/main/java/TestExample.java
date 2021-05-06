import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

public class TestExample implements AutoCloseable
{
    private final Driver driver;

    public TestExample( String uri, String user, String password )
{
    driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
}

    @Override
    public void close() throws Exception
    {
        driver.close();
    }

    public static void main( String... args ) throws Exception
    {
        Driver driver = GraphDatabase.driver("bolt://localhost:7688", AuthTokens.basic("", ""));
        try (Session session = driver.session()) {
            Result result1 = session.run("MATCH (n) RETURN n");
            Result result2 = session.run("MATCH (n) RETURN n.name");
            Result result3 = session.run("MATCH (ee:Person)-[:DIRECTED]-(star) WHERE ee.name = \"Mike Nichols\" RETURN ee, star");
            Result result4 = session.run("match (n:Movie{title:\"Top Gun\"})<-[a:ACTED_IN]-(f) return n.title,a.roles,f.name");
            Result result5 = session.run("MATCH (n:Person) WHERE n.name = \"Keanu Reeves\" RETURN n.name;");

            System.out.println("query1: returns all nodes id" + result1.list()+ "\n" );
            System.out.println("query2: returns all nodes names" + result2.list()+ "\n" );
            System.out.println("query3: returns what Mike Nichols have Directed" + result3.list()+ "\n" );
            System.out.println("query4: returns Top Gun actors and the role they played in the movie" + result4.list()+ "\n" );
            System.out.println("query5: returns Keanu Reeves because he is breathtaking" + result5.list()+ "\n" );

        }
        driver.close();
    }
}