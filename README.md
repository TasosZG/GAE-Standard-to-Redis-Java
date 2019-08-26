# Google App Engine Standard to Memorystore(redis) with Java

Connect from Google App Engine Standard to Memorystore(redis) with the Jedis client.

## Configuration

In your Google Cloud Platform project:
1. Enable App Engine in the **us-central*** region
2. Create a Memorystore Instance in the **us-central1** region
3. Create a [VPC Connector](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access#creating_a_connector) in the **us-central1** region
4. In the ```appengine-web.xml``` file, replace the values PROJECT_ID, REGION and VPC_CONNECTOR_NAME
5. In the ```RedisServlet.java``` file, replace the "10.0.0.3" IP with your Memorystore instance's IP
6. Run the following commands to deploy your application to App Engine:
```bash
mvn package
gcloud beta app deploy target/redisconnect-1.0
```

**\*** You can use a different region, just make sure to use the same region in the 4 first steps.

