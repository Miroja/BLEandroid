package com.example.ramiro.bleandroid;

/**
 * Created by Ramiro on 21-4-2017.
 */

public class U2f_Register {



    public void U2f_Token_Register(){




    }


    /*
*
*This is an error message that is output by the U2F token if no test-of-user-presence
*could be obtained by the U2F token.
*This message does not have a raw/canonical representation.
*
* */

    private String Register_Error()
    {

        String error = "Error: Test-of-User-Precense Required";
        return error;

    }

    /*
    *
    *This message is output by the U2F token once it created a new keypair in response to
    *the registration request message. Note that U2F tokens SHOULD verify user presence
    *before returning a registration response success message (otherwise they SHOULD return
    *a test-of-user-presence-required message
    */
    private void Register_Succes()
    {
        // A reserved byte [1 byte], which for legacy reasons has the value 0x05
        String reseved_byte = "0x05";

        //A user public key [65 bytes]. This is the (uncompressed) x,y-representation of a
        // curve point on the P-256 NIST elliptic curve.

        String user_public_key = "user_public_key";

        //A key handle length byte [1 byte], which specifies the length of the key handle
        /* hier komt de handle length byte*/


        //




    }
}
