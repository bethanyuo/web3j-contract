# Smart Contracts using Web3j
> Project not complete
Use Web3j – Lightweight Java and Android library for integration with Ethereum clients.<br/>
This exercise will show how to create contract wrappers from native java code, deploy contracts and how to interact with an already deployed contract on the Ethereum Ropsten Testnet.

## Requirements
*	[IntelliJ IDEA (v 2020)](https://www.jetbrains.com/idea/download/)
* MetaMask

## Set up environment
First, create a new Maven Project. Then, in pom.xml, add web3j as a dependency.<br/>
NOTE: Make sure to reimport your POM file after adding a new dependency, IDEA takes care of the rest.
 
In order to create a wrapper class of the contract, we will need to compile it and create two files with `bytecode` and the `application binary interface`.

Install solc:
```sh
$ npm install –g solc
```
Create a .sol called _ArrayOfFacts_, which will have 3 functions: adding a `fact`, get a fact by an `index`, and get `how many facts` are stored in the contract:
 
To generate the wrapper code, compile the smart contract and create the bytecode and abi in the same directory:
```sh
$ solcjs ArrayOfFacts.sol --bin --abi --optimize -o .
```
 
Finally, to generate the wrapper code, use web3j’s `Command Line Tools`. Go to https://github.com/web3j/web3j-cli#installation and download the release appropriate for your OS.<br/>
Extract it, open a terminal in the bin directory and run:
```sh
$ web3j solidity generate /path/to/<smart-contract>.bin /path/to/<smart-contract>.abi –o /path/to/src/main/java –p com.your.organisation.name
```
This will create a wrapper class of the contract. NOTE: You may need to restart the IDE to refresh the paths and detect web3j.
 
In the `main/java` application folder create a file named _ContractService.java_. Then, create a class called `ContractService`, which will handle the connection Ropsten and handle the contract's deployment, load and call of it.

Make sure you follow these steps when you create a Java Class file:<br/>
Right click on the `folder/package` -> `[New]` -> `[Java Class]`

Create 3 private properties for the `Web3`, the `Credentials (account)` and for the `Contract` itself.
 
Then, create a constructor, which takes 2 parameters: `provider of the node` and a `private key` for the credentials.
 
We will need HTTPProvider in order to create our connection to the Ropsten Testnet using `Infura.io`.
Now let’s get the necessary Infura.io provider. Go to https://infura.io/ and copy the Ropsten URL.
 
Create a _Main.java_ file and paste in the main.
 
For the example of the exercise, we will take one `private key` from MetaMask and use it as a signer for the deployment transaction. Keep in mind only the `contract owner` can add facts to the contract.
 
If you do not have ETHt, use the MetaMask faucet: https://faucet.metamask.io/.

Go to _ContractService.java_ and create a deploy method, which creates a transaction for the deployment of the contract and then sends it. The method will wait to for the transaction to be mined and then finish.
 
In Ropsten Etherscan:<br/>
Copy the contract address and create a load function, which loads a contract by its address.

## Writing to the Smart Contract
In the ContractService class, create a method, which takes as an argument a fact, calls the contract's add function and sends it. The result will return when the transaction is mined.
 
In Etherscan:<br/>
Try adding a fact using another private key as an account. _RESULT: `FAIL`_
## Reading from the Smart Contract
When reading from a Smart Contract, no wallets or private keys are needed. 
In the `ContractService` class create a method which gets a fact by a given `index` and returns a string with the fact.
Then create a method which returns `how many facts` are stored in the contract.

## Module
MI4: Module 5: E5
 
 
