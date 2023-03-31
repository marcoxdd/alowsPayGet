import React, { useState } from 'react';

const LoginPage: React.FC = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
        // Insira aqui a lógica de validação do login
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Usuário:
                <input type="text" value={username} onChange={(event) => setUsername(event.target.value)} />
            </label>
            <label>
                Senha:
                <input type="password" value={password} onChange={(event) => setPassword(event.target.value)} />
            </label>
            <button type="submit">Entrar</button>
        </form>
    );
};

export default LoginPage;