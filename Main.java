public class Main{

meu_banco = Banco("Banco Brasil")

conta1 = meu_banco.criar_conta("Paulo", saldo_inicial=1000)
conta2 = meu_banco.criar_conta("LABIOS DE MELLL", saldo_inicial=500)

conta1.verificar_saldo()
conta2.verificar_saldo()

meu_banco.transferir(200, conta1, conta2)

conta1.verificar_saldo()
conta2.verificar_saldo()

}