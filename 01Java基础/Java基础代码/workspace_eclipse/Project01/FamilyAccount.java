class FamilyAccount{

	public static void main (String[] args){
	
	boolean isFlag = true;
	String details = "��֧\t�˻����\t��֧���\t˵ ��\n ";
	//�����˻����
	int balance = 10000;


	while (isFlag){
	System.out.println("-----------------��ͥ��֧�������----------------");
	System.out.println("                 1 ��֧��ϸ");
	System.out.println("                 2 �Ǽ�����");
	System.out.println("                 3 �Ǽ�֧��");
	System.out.println("                 4 ��    ��\n");
	System.out.print("                 ��ѡ��1-4����");
	//��ȡ�û���ѡ��
	char selection = Utility.readMenuSelection();
	switch(selection){
		case '1':
			System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
			System.out.println(details);
			System.out.println("--------------------------------------------------\n");
			break;
		case '2':
			System.out.print("���������");
			int addMoney = Utility.readNumber();
			System.out.print("��������˵����");
			String addInfo = Utility.readString();
			//����balance
			balance += addMoney;
			//����details
			details += "����\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n";
			System.out.println("---------------------�Ǽ����--------------------\n");
			break;
		case '3':
			//System.out.println("3 �Ǽ�֧��");
			System.out.print("����֧����");
			int minusMoney = Utility.readNumber();
			System.out.print("����֧��˵����");
			String minusInfo = Utility.readString();
			
			if (balance >= minusMoney){
			//����balance
			balance -= minusMoney;
			//����details
			details += "֧��\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n";
			System.out.println("---------------------�Ǽ����--------------------\n");
			}
			else {
				System.out.println("���㣬֧��ʧ��");
			}
			break;
		case '4':
			System.out.print("ȷ���Ƿ��˳�(Y/N):");
			char isExit = Utility.readConfirmSelection();
			if (isExit == 'Y'){
				//ѭ����ֹ����
				isFlag = false;
			}
			
	}
	
	
	
	}

}

}