package com.smart.web3j.test;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class ArrayOfFacts_sol_ArrayOfFacts extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50600180546001600160a01b031916331790556103bb806100326000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806306661abd14610046578063b0c8f9dc14610060578063e63b372d14610108575b600080fd5b61004e61019a565b60408051918252519081900360200190f35b6101066004803603602081101561007657600080fd5b81019060208101813564010000000081111561009157600080fd5b8201836020820111156100a357600080fd5b803590602001918460018302840111640100000000831117156100c557600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506101a1945050505050565b005b6101256004803603602081101561011e57600080fd5b5035610244565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561015f578181015183820152602001610147565b50505050905090810190601f16801561018c5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6000545b90565b6001546001600160a01b03163314610200576040805162461bcd60e51b815260206004820152601e60248201527f596f75206d7573742062652074686520436f6e7472616374206f776e65720000604482015290519081900360640190fd5b600080546001810182559080528151610240917f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563019060208401906102ed565b5050565b60606000828154811061025357fe5b600091825260209182902001805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156102e15780601f106102b6576101008083540402835291602001916102e1565b820191906000526020600020905b8154815290600101906020018083116102c457829003601f168201915b50505050509050919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061032e57805160ff191683800117855561035b565b8280016001018555821561035b579182015b8281111561035b578251825591602001919060010190610340565b5061036792915061036b565b5090565b61019e91905b80821115610367576000815560010161037156fea264697066735822122023e2cb8e3e4e239ea9c4ee54a9028dc91060251c57a72106c398238c73a947ae64736f6c63430006010033";

    public static final String FUNC_ADD = "add";

    public static final String FUNC_COUNT = "count";

    public static final String FUNC_GETFACT = "getFact";

    @Deprecated
    protected ArrayOfFacts_sol_ArrayOfFacts(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ArrayOfFacts_sol_ArrayOfFacts(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ArrayOfFacts_sol_ArrayOfFacts(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ArrayOfFacts_sol_ArrayOfFacts(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> add(String newFact) {
        final Function function = new Function(
                FUNC_ADD,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(newFact)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> count() {
        final Function function = new Function(FUNC_COUNT,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> getFact(BigInteger index) {
        final Function function = new Function(FUNC_GETFACT,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static ArrayOfFacts_sol_ArrayOfFacts load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ArrayOfFacts_sol_ArrayOfFacts(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ArrayOfFacts_sol_ArrayOfFacts load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ArrayOfFacts_sol_ArrayOfFacts(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ArrayOfFacts_sol_ArrayOfFacts load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ArrayOfFacts_sol_ArrayOfFacts(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ArrayOfFacts_sol_ArrayOfFacts load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ArrayOfFacts_sol_ArrayOfFacts(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ArrayOfFacts_sol_ArrayOfFacts> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ArrayOfFacts_sol_ArrayOfFacts.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<ArrayOfFacts_sol_ArrayOfFacts> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ArrayOfFacts_sol_ArrayOfFacts.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ArrayOfFacts_sol_ArrayOfFacts> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ArrayOfFacts_sol_ArrayOfFacts.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ArrayOfFacts_sol_ArrayOfFacts> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ArrayOfFacts_sol_ArrayOfFacts.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}