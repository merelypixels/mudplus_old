package mudplusdriver

import parse.Message

class MessageQueueService {
	public final MAX_QUEUED_COMMANDS_PER_PLAYER = 50
	private ArrayList<Message> _incomingMessages
	private ArrayList<Message> _outgoingMessages

	def pushIn(Message message) {
		_incomingMessages.add(message)
	}

	Message getNextInMessage() {
		_incomingMessages.first()
	}

	def pushOut(Message message) {
		message.processedTime = new Date()
		_outgoingMessages.add(message)
	}

	Message getNextOutMessage() {
		_outgoingMessages.first()
	}
}
