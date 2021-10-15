# password-recovery-jwt-invalidate

security: JWT

method: Bearer token

register user:
url: localhost:8080/secure/registration

method: post

request body:

{
    "active": true,
    "email": "tamil@buaya.com",
    "fullName": "mohammad asif",
    "firstName": "asif",
    "lastName": "aftab",
    "membershipNum": "110",
    "contactNum": "0143111",
    "dob": "2020-05-25T16:00:00.000+0000",
    "status": 1,
    "password": "test"
  }



url to get jwt (login url)

url: http://localhost:8080/secure/authenticate

method: post

request body:

{
	"username":"kamil@buaya.com",
	"password" : "test"
}




to generate reset password url link and send to mail

url: localhost:8080/secure/reset/password/url

method: post

{
	"username" : "asifaftab87@gmail.com"
}


to update password

localhost:8080/secure/update/password?
cipherText=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0YW1pbEBidWF5YS5jb20iLCJhdXRob3JpdGllcyI6W3siYXV0aG9yaXR5IjoiUk9MRV9VU0VSIn1dLCJpYXQiOjE2MjM1NTc0NjAsImV4cCI6MTYyMzY0Mzg2MH0.gQGvB8wkWceDcBeNq_oRCBg-imb3aF0eY2oUa9gxnM4

here cipherText value is first encrypted using aes algorithm and then encoded using base64ui.

logout: localhost:8080/secure/token/invalidate


secure url: localhost:8080/secure/user/get/all

Thanks
