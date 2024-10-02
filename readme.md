# Setup

1. Go to /insomnia and import the collection - `gcash-poc.json` to insomnia
2. run the spring boot app
   - ensure `./mvnw clean install` is run first
3. ensure the openai key in `application.properties` is changed to your openai key

   - The format and content of the application.properties file are below as starters:

   ```
   spring.application.name=gcash
   server.port=8080
   openai.model=gpt-4o
   aiproxy.api.url=http://localhost:8000/chat // This would be the hostname of your data plane
   azure.model=gpt-3.5-turbo
   ```

4. call the clients to proxy to Azure OpenAI or OpenAI Chatgpt from insomnia under the `ai-proxy` folder
