package statements;

import java.util.Scanner;

public class StatusCodes {

    public static void main(String[] args) {

        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();


        String result;

        switch (status) {
            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 307:
                result = "Temporary Redirect";
                break;
            case 400:
                result = "Bad Request";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "Invalid Status Code";
        }

        System.out.println(result);
    }
}

/*

### HTTP is the protocol that governs communications between servers and web clients (i.e. browsers). Part of the protocol includes a `status code` returned by the server to tell the browser the status of its most recent page request. Use a `switch statement` to determine the message from the `status` value. Use the following chart to determine the results:

**Status Codes**

> - 200: OK
> - 201: Created
> - 202: Accepted
> - 307: Temporary Redirect
> - 400: Bad Request
> - 401: Unauthorized
> - 403: Forbidden
> - 404: Not Found
> - 410: Gone
> - 500: Internal Server Error
> - 303: Service Unavailable
> - Any other number should output: Invalid status code

Main topics: switch statements, primitive variables

**Example Flows:**

```
  Enter status code:
  200
  OK
```
```
  Enter status code:
  400
  Unauthorized
```
```
  Enter status code:
  999
  Invalid status code
```

 */
