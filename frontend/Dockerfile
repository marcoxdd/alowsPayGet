# Use an official Node.js runtime as a parent image
FROM node:18-alpine

# Set the working directory to /app
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH

# Copy the package.json and package-lock.json files to the container
COPY my-app/package*.json ./

# Install dependencies
RUN npm install -g npm@9.6.2

# Copy the rest of the app's source code to the container
COPY ./my-app .

# Build the app
RUN npm run build

# Set the environment variable to production
ENV NODE_ENV=production


# Expose port 3000 to the outside world
EXPOSE 3000


# Start the app
CMD ["npm", "run", "start"]