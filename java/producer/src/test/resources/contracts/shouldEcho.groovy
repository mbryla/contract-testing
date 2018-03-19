package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url '/echo/hello'
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }

    response {
        status 200
        body("{\"echo\": \"hello\"}")
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }

}