/**
 * Implemented by adorsys GmbH & Co. KG in 2013
 * http://www.adorsys.de
 */
package de.adorsys.mongodbplayground;

import java.net.UnknownHostException;

import org.junit.Assert;
import org.junit.Test;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

/**
 * @author sso@adorsys.de
 *
 */
public class MongoTest {

	@Test
	public void testSaveData() throws UnknownHostException {
		Mongo mongo = new Mongo();
		DB db = mongo.getDB("test");
		DBCollection collection = db.getCollection("foo");
		collection.insert(BasicDBObjectBuilder.start().get());
		DBObject findOne = collection.findOne();
		Assert.assertNotNull(findOne);
	}

}
